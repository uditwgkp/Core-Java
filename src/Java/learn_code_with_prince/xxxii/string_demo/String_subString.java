package Java.learn_code_with_prince.xxxii.string_demo;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.ConfigurationFactory;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory;
import org.apache.logging.log4j.core.layout.PatternLayout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class String_subString {
    // a part of String is called sub String
    // String class provide built in subString method
    public static void main(String[] args) throws IOException {
        String s1 = "Hi I am a java, a programming language";

        String s2 = s1.substring(4);
        String s3 = s1.substring(3,10);
        System.out.println(s2);
        System.out.println(s3);

        String[] s4 = s1.split(" ");
        System.out.println(s4[3]);
    }
}
