package com.troy.entity;

import net.sf.json.JSONObject;

public class ProjectRole {
	private Model model;
	public Model getModel() {
		return model;
	}




	public void setModel(Model model) {
		this.model = model;
	}
	private boolean owner;
	private boolean writer;
	private boolean executer;
	
	
	
	
	
	
	
	
	
	public String getJson(){
		JSONObject object = JSONObject.fromObject(model);
		  
		return "\"Project\":{\"model\":"+object.toString()+",\"owner\":\""+owner+"\",\"writer\":\""+writer+"\",\"executer\":\""+executer+"\"}";
	}
	
	
	
	
	public ProjectRole(){
		owner=false;
		writer=false;
		executer=false;
		
	}
	
	public boolean isOwner() {
		return owner;
	}
	public void setOwner(boolean owner) {
		this.owner = owner;
	}
	public boolean isWriter() {
		return writer;
	}
	public void setWriter(boolean writer) {
		this.writer = writer;
	}
	public boolean isExecuter() {
		return executer;
	}
	public void setExecuter(boolean executer) {
		this.executer = executer;
	}

}
