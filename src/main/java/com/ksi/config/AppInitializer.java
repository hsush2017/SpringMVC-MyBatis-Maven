package com.ksi.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(AppConfiguration.class);
		ctx.setServletContext(container);

		ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		

		/*
		 * https://stackoverflow.com/questions/34944004/how-to-precompile-jsp-in
		 * -a-spring-boot-application
		 * 
		 * JSP預編譯是指在部署一個Web應用前（或部署時），就將Web應用中所有的JSP檔編譯成Servlet的.class檔，
		 * 這樣在客戶端訪問JSP時，JSP容器不再對JSP檔進行編譯，而是直接尋找編譯好的.class檔進行加載和調用。
		 * JSP預編譯可以提高Web應用的性能，同時，Web應用開發者可以在部署前就將所有JSP編譯成.class檔，
		 * 然後將JSP檔刪去，這樣可以使JSP代碼不被不該看的人看到
		 */
		/*
		getDeepResourcePaths(container, "/jsp/").forEach(jspPath -> {
			System.out.println("Registering JSP:" + jspPath);
			ServletRegistration.Dynamic reg = container.addServlet(jspPath, "org.apache.jasper.servlet.JspServlet");
			reg.setInitParameter("jspFile", jspPath);
			reg.setLoadOnStartup(99);
			reg.addMapping(jspPath);
		});
		*/
	}
/*
	private static Stream<String> getDeepResourcePaths(ServletContext servletContext, String path) {
		return (path.endsWith("/"))
				? servletContext.getResourcePaths(path).stream().flatMap(p -> getDeepResourcePaths(servletContext, p))
				: Stream.of(path);
	}
	*/
}
