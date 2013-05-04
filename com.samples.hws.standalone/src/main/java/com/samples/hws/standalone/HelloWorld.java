package com.samples.hws.standalone;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class HelloWorld extends AbstractHandler {

    @Override
    public void handle(final String target, final Request baseRequest,
                       final HttpServletRequest request,
                       final HttpServletResponse response
                       ) throws IOException, ServletException {
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println("Hello World!");
    }

    public static void main(final String[] args) throws Exception {
        final Server server = new Server(8080);
        server.setHandler(new HelloWorld());
        server.start();
        server.join();
    }
}
