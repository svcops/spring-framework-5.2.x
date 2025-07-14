package io.intelliij.debug.logger;

import org.slf4j.Logger;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * DebugLogger
 *
 * @author tech@intellij.io
 */
public class DebugLogger {

	private static final Map<String, Logger> LOGGER_MAP = new ConcurrentHashMap<>();

	public static Logger getLogger(String spec) {
		if (LOGGER_MAP.containsKey(spec)) {
			return LOGGER_MAP.get(spec);
		}
		Logger logger = org.slf4j.LoggerFactory.getLogger(spec);
		LOGGER_MAP.put(spec, logger);
		return logger;
	}

}
