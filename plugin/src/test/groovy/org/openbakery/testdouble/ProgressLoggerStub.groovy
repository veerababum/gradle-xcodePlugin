package org.openbakery.testdouble

import org.gradle.api.Nullable
import org.gradle.internal.logging.progress.ProgressLogger


class ProgressLoggerStub implements ProgressLogger {

	def progress = []

	@Override
	String getDescription() {
		return null
	}

	@Override
	ProgressLogger setDescription(String s) {

	}

	@Override
	String getShortDescription() {
		return null
	}

	@Override
	ProgressLogger setShortDescription(String s) {

	}

	@Override
	String getLoggingHeader() {
		return null
	}

	@Override
	ProgressLogger setLoggingHeader(String s) {

	}

	@Override
	ProgressLogger start(String s, String s1) {
		return null
	}

	@Override
	ProgressLogger start(String s, String s1, int i) {
		return null
	}

	@Override
	void started() {
	}

	@Override
	void started(String s) {
	}

	@Override
	void started(String s, int i) {
	}

	@Override
	void progress(String status) {
		progress << status
	}

	@Override
	void progress(@Nullable String s, boolean b) {
		progress << status
	}

	@Override
	void completed() {
	}

	@Override
	void completed(String s, boolean b) {
	}
}
