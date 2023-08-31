# tech-news-java-api
The benefits of Spring Boot firsthand as you code the back end of a social news website. You've built something like this before, including capabilities for users to create accounts, post links to interesting articles, and upvote or comment on other users' posts.  

## Install the JDK on Windows
In order to install the Java programming language, you need the JDK. But first you must create an Oracle account. When you have an account with Oracle, complete the following steps:

1. Navigate to the [JDK downloads page](https://www.oracle.com/java/technologies/downloads/#java8).

2. Select the "Windows x86" download option.

3. Click the user agreement and scroll to the bottom, then check the box accepting the agreement.

4. Sign in to your Oracle account.

5. Run the install file.

6. On the first setup page, click Install, as shown in the following image:

![300-install-1](https://github.com/oliverLo78/tech-news-java-api/assets/109435666/9fc05eb1-c02d-43bd-bc0e-5cef881f9337)

A setup window titled "Welcome to Java" includes Cancel and Install buttons at the bottom.

7. Select the install path and click next.

8. On the "Change in License Terms" page, click OK.

9. Once again, choose the installation directory.

10. Click Next. When the Complete page appears, you've successfully installed Java!

## Install IntelliJ IDEA for Windows
Next you’ll install IntelliJ IDEA to use as your code editor. Complete the following steps:

1. Navigate to the IntelliJ IDEA download page.

2. Download the Community Edition.

3. Run the install file.

4. On the first setup page, choose Next.

5. Select the destination folder and click Next.

6. Mark the "Update PATH variable option", create the ".java" association, and click Next.

7. Click Install.

8. Choose your preferred option for when to reboot.

9. Once you've rebooted, launch IntelliJ.

10. Accept the Privacy Policy and continue.

11. This final step is left to your own discretion. You can either choose to send usage statistics or choose the "Don't send" option to keep from sharing data.

Great work. You've installed IntelliJ IDEA! Note that on the first launch of IntelliJ IDEA, it will ask you to choose some settings. In the bottom left of that screen, choose the Set Defaults option.

[For further guidance, watch this](https://www.youtube.com/watch?v=JOc9lVFVQso).

## Create the Spring Boot Java Project
Although we've installed all the required technology, we still have some setup to do. For one thing, we have to create the Spring Boot project. We'll use the application Spring Initializr to help do that. Spring Initializr's user interface allows us to select the configuration variables and dependencies that we need for a project.

Dependencies are bundled into groups of libraries that address certain common tasks. Let's consider, then, some of the tasks that we'll tackle for this project: we'll create an API that will connect to a MySQL database, and we'll use an ORM to map Java objects to the database tables, perform session management, and present HTML template pages to the API's users. We'll need to keep these tasks in mind while setting up the project because we'll select dependency bundles based on those needs.

Now to get started with Spring Initializr! Open your browser and navigate to the [Spring Initializr website](https://start.spring.io/). On that webpage, you'll have to choose from a series of settings and other options to initialize your project. Use the following instructions to complete the form:

    -In the Project section, select Maven Project (the default).

    -In the Language section, select Java (the default).

    -In the Spring Boot section, select version 2.6.4 (or whatever the default version is).

    -In the Project Metadata section, input the following information:

Group: com.technews

    *Artifact: tech-news-java-api

    *Name: tech-news-java-api

    *Description: Tech News Java API Project

    *Package Name: com.technews

    *Packaging: Jar (default)

Java: 8

In the Dependencies section on the right side of the page, click the Add Dependencies button. Then search for and add the following dependencies:

    +Spring Web

    +Spring Data JPA

    +MySQL Driver

    +Spring Session

    +Thymeleaf


