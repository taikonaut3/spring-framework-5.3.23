package com.zwb.test.mvc;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.AprLifecycleListener;
import org.apache.catalina.core.StandardServer;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;
import java.io.File;

/**
 * 内嵌的tomcat
 */
public class EmbeddedTomcat {
	private Tomcat tomcat;
 
	private void startTomcat(int port, String contextPath, String baseDir) throws ServletException, LifecycleException {
		tomcat = new Tomcat();
		tomcat.setPort(port);
		tomcat.setBaseDir(".");
		StandardServer server = (StandardServer) tomcat.getServer();
		AprLifecycleListener listener = new AprLifecycleListener();
		server.addLifecycleListener(listener);
		tomcat.addWebapp(contextPath, baseDir);
		tomcat.start();
		tomcat.getServer().await();
	}
 
	private void stopTomcat() throws LifecycleException {
		tomcat.stop();
	}
 
	public static void main(String[] args) {
		try {
			int port = 8080;
			String contextPath = "/test";
			String baseDir = new File("spring-mytest/src/main/web").getAbsolutePath(); // 项目中web目录名称，以前版本为WebRoot、webapp、webapps，现在为WebContent
			EmbeddedTomcat tomcat = new EmbeddedTomcat();
			tomcat.startTomcat(port, contextPath, baseDir);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
