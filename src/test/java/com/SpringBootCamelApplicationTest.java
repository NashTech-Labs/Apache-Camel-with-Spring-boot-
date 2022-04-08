package com;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.apache.camel.builder.DeadLetterChannelBuilder;
import org.apache.camel.builder.RouteBuilderLifecycleStrategy;
import org.apache.camel.impl.DefaultCamelContext;
import org.junit.jupiter.api.Test;

/**
 * The type Spring boot camel application test.
 */
class SpringBootCamelApplicationTest {
    /**
     * Test configure.
     *
     * @throws Exception the exception
     */
    @Test
    void testConfigure() throws Exception {
        SpringBootCamelApplication springBootCamelApplication = new SpringBootCamelApplication();
        springBootCamelApplication.configure();
        assertNull(springBootCamelApplication.getRouteCollection().getCamelContext());
    }

    /**
     * Test configure 2.
     *
     * @throws Exception the exception
     */
    @Test
    void testConfigure2() throws Exception {
        // TODO: This test is incomplete.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by configure()
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        SpringBootCamelApplication springBootCamelApplication = new SpringBootCamelApplication();
        springBootCamelApplication.addRoutesToCamelContext(new DefaultCamelContext());
        springBootCamelApplication.configure();
    }

    /**
     * Test configure 3.
     *
     * @throws Exception the exception
     */
    @Test
    void testConfigure3() throws Exception {
        RouteBuilderLifecycleStrategy routeBuilderLifecycleStrategy = mock(RouteBuilderLifecycleStrategy.class);
        doNothing().when(routeBuilderLifecycleStrategy).afterConfigure((org.apache.camel.builder.RouteBuilder) any());
        doNothing().when(routeBuilderLifecycleStrategy).beforeConfigure((org.apache.camel.builder.RouteBuilder) any());

        SpringBootCamelApplication springBootCamelApplication = new SpringBootCamelApplication();
        springBootCamelApplication.addLifecycleInterceptor(routeBuilderLifecycleStrategy);
        springBootCamelApplication.addRoutesToCamelContext(new DefaultCamelContext());
        springBootCamelApplication.configure();
        verify(routeBuilderLifecycleStrategy).afterConfigure((org.apache.camel.builder.RouteBuilder) any());
        verify(routeBuilderLifecycleStrategy).beforeConfigure((org.apache.camel.builder.RouteBuilder) any());
    }


    /**
     * Test move all file.
     */
    @Test
    void testMoveAllFile() {
        SpringBootCamelApplication springBootCamelApplication = new SpringBootCamelApplication();
        springBootCamelApplication.moveAllFile();
        assertNull(springBootCamelApplication.getRouteCollection().getCamelContext());
    }

    /**
     * Test move all file 2.
     *
     * @throws Exception the exception
     */
    @Test
    void testMoveAllFile2() throws Exception {
        // TODO: This test is incomplete.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by moveAllFile()
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        SpringBootCamelApplication springBootCamelApplication = new SpringBootCamelApplication();
        springBootCamelApplication.addRoutesToCamelContext(new DefaultCamelContext());
        springBootCamelApplication.moveAllFile();
    }

    /**
     * Test move all file 3.
     *
     * @throws Exception the exception
     */
    @Test
    void testMoveAllFile3() throws Exception {
        RouteBuilderLifecycleStrategy routeBuilderLifecycleStrategy = mock(RouteBuilderLifecycleStrategy.class);
        doNothing().when(routeBuilderLifecycleStrategy).afterConfigure((org.apache.camel.builder.RouteBuilder) any());
        doNothing().when(routeBuilderLifecycleStrategy).beforeConfigure((org.apache.camel.builder.RouteBuilder) any());

        SpringBootCamelApplication springBootCamelApplication = new SpringBootCamelApplication();
        springBootCamelApplication.addLifecycleInterceptor(routeBuilderLifecycleStrategy);
        springBootCamelApplication.addRoutesToCamelContext(new DefaultCamelContext());
        springBootCamelApplication.moveAllFile();
        verify(routeBuilderLifecycleStrategy).afterConfigure((org.apache.camel.builder.RouteBuilder) any());
        verify(routeBuilderLifecycleStrategy).beforeConfigure((org.apache.camel.builder.RouteBuilder) any());
    }


    /**
     * Test move specific file.
     */
    @Test
    void testMoveSpecificFile() {
        SpringBootCamelApplication springBootCamelApplication = new SpringBootCamelApplication();
        springBootCamelApplication.moveSpecificFile("Type");
        assertNull(springBootCamelApplication.getRouteCollection().getCamelContext());
    }

    /**
     * Test move specific file 2.
     *
     * @throws Exception the exception
     */
    @Test
    void testMoveSpecificFile2() throws Exception {
        // TODO: This test is incomplete.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by moveSpecificFile(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        SpringBootCamelApplication springBootCamelApplication = new SpringBootCamelApplication();
        springBootCamelApplication.addRoutesToCamelContext(new DefaultCamelContext());
        springBootCamelApplication.moveSpecificFile("Type");
    }


    /**
     * Test move specific file with body.
     */
    @Test
    void testMoveSpecificFileWithBody() {
        SpringBootCamelApplication springBootCamelApplication = new SpringBootCamelApplication();
        springBootCamelApplication.moveSpecificFileWithBody("Not all who wander are lost");
        assertNull(springBootCamelApplication.getRouteCollection().getCamelContext());
    }

    /**
     * Test move specific file with body 2.
     *
     * @throws Exception the exception
     */
    @Test
    void testMoveSpecificFileWithBody2() throws Exception {
        // TODO: This test is incomplete.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by moveSpecificFileWithBody(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        SpringBootCamelApplication springBootCamelApplication = new SpringBootCamelApplication();
        springBootCamelApplication.addRoutesToCamelContext(new DefaultCamelContext());
        springBootCamelApplication.moveSpecificFileWithBody("Not all who wander are lost");
    }


}

