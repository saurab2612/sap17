package com.training;

import javax.jcr.LoginException;
import javax.jcr.Node;
import javax.jcr.Property;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.apache.jackrabbit.core.TransientRepository;

public class WriteContent {

	public static void main(String[] args) throws LoginException, RepositoryException {
		Repository repo = new TransientRepository();
		Session sess = repo.login(new SimpleCredentials("admin", "admin".toCharArray()));
		
		Node root = sess.getRootNode();
		Node courses = root.addNode("courses");
		Node java = courses.addNode("java");
		Node jee = courses.addNode("jee");
		
		java.setProperty("What is java", "java is a OO progeamming language");
		java.setProperty("features of java", "functional programming,streams,nashorn script");
		java.setProperty("data types", "int------------- short----------- byte -----------------------");
		
		jee.setProperty("lifecycle of servlet", "init() and destroy() fires only once Service() fires multiple times");
		jee.setProperty("implicit objects", "request response,application,session,page,pagecontext,out,config,exception");
		sess.save();
		System.out.println("content published");
		sess.logout();
		
	}

}
