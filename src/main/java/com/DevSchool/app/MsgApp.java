package com.DevSchool.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import com.DevSchool.domain.Message;


public class MsgApp {
	public static void main (String [] args){

		ApplicationContext ctx = new GenericXmlApplicationContext("app-context.xml");	
		Message msg = (Message) ctx.getBean("message");
		msg.printString("Welcome to my channel!");
	}
}
