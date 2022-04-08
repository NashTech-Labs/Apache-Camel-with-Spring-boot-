package com;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Spring boot camel application.
 */
@SpringBootApplication
public class SpringBootCamelApplication extends RouteBuilder {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCamelApplication.class, args);
	}



		@Override
		public void configure() throws Exception {
// move data from one file another file
			System.out.println("started...");
//			moveAllFile();
//			 moveSpecificFile("specific file");
			 moveSpecificFileWithBody("hello");

			System.out.println("End...");
		}

	/**
	 * Move all file.
	 */
	public void moveAllFile() {
			from("file:/home/knoldus/Desktop/folder1?noop=true").to("file:/home/knoldus/Desktop/folder2");
		}

	/**
	 * Move specific file.
	 *
	 * @param type the type
	 */
//
    public void moveSpecificFile(String type) {
        from("file:/home/knoldus/Desktop/folder1?noop=true").filter(header(Exchange.FILE_NAME).startsWith(type))
                .to("file:/home/knoldus/Desktop/folder2");
    }

	/**
	 * Move specific file with body.
	 *
	 * @param content the content
	 */
//
    public void moveSpecificFileWithBody(String content) {
        from("file:/home/knoldus/Desktop/folder1?noop=true").filter(body().startsWith(content))
                .to("file:/home/knoldus/Desktop/folder2");
    }


	}

