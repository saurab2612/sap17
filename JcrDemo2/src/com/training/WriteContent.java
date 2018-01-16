package com.training;

import javax.jcr.LoginException;
import javax.jcr.Node;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.apache.jackrabbit.commons.JcrUtils;

public class WriteContent {

	public static void main(String[] args) throws LoginException, RepositoryException {
		Repository repo = JcrUtils.getRepository("http://localhost:8083/server");
		Session sess =repo.login(new SimpleCredentials("admin", "admin".toCharArray()));
		
		Node root1 = sess.getRootNode();
		
		Node film1 = root1.addNode("film1");
		Node hwood1 = film1.addNode("hollywood1");
		Node bwood = film1.addNode("bollywood1");
		Node jumanji = hwood1.addNode("jumanji1");
		jumanji.setProperty("review by taran" , " good not bad");
		jumanji.setProperty("review by karan" , " excellent watch 3 times");
		
		Node n1921 = bwood.addNode("19211");
		n1921.setProperty("review by taran" , "bla bla bla");
		n1921.setProperty("review by karan" , "total flop disaster terrible ");
		
		sess.save();
		sess.logout();
		System.out.println("content published");
		
		
	}

}
