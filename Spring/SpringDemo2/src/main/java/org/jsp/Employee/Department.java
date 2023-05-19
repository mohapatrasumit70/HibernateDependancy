package org.jsp.Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Department {
  private List<Integer> eid;
  private Set<String> name;
  private Map<Integer, String> detail;
public List<Integer> getEid() {
	return eid;
}
public void setEid(List<Integer> eid) {
	this.eid = eid;
}
public Set<String> getName() {
	return name;
}
public void setName(Set<String> name) {
	this.name = name;
}
public Map<Integer, String> getDetail() {
	return detail;
}
public void setDetail(Map<Integer, String> detail) {
	this.detail = detail;
}
  
}
