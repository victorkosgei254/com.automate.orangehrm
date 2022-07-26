/* groovylint-disable MethodReturnTypeRequired */

import groovyjarjarpicocli.CommandLine
import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import org.gradle.api.Task
import org.gradle.api.tasks.JavaExec

import org.gradle.api.tasks.options.Option

import org.gradle.api.Action

class AutomationTool extends DefaultTask {

    private String name = 'Kosgei'
    private  String testCase = ''

    AutomationTool() {
        group = 'QA_Automation'
        dependsOn('assemble', 'testClasses', 'build')
        mustRunAfter("build")
    }

    @Option(option = 'runTests',description = 'Blah blah')
    void setTestCase(String tc) {
        testCase = (String)tc
    }

    @Input
    String getTestCase() {
        return testCase
    }

    @TaskAction
    public void runTask() {
        project.javaexec {
                 main = 'io.cucumber.core.cli.Main'
                 classpath = project.configurations.cucumberRuntime + project.sourceSets.main.output + project.sourceSets.test.output
                 args = [
                        '--plugin', 'pretty',
                        '--plugin', 'html:target/cucumber-report5.html',
                        '--glue', 'com.automate.orangehrm.components',
                        'src/test/resources/components',
                        '--tags',testCase
                ]

        }

    }

}
