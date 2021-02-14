package collection;

import java.util.*;

class CollectionIn {
private List<String>name=new ArrayList<>();
private Set<Long>Phnno;
private HashMap<Long,String>adharno;
//private HashMap<Integer,Address> address;

private Properties email;







@Override
public String toString() {
	return "CollectionIn [name=" + name + ", Phnno=" + Phnno + ", adharno=" + adharno + ", email=" + email + "]";
}
public Set<Long> getPhnno() {
	return Phnno;
}
public void setPhnno(Set<Long> phnno) {
	Phnno = phnno;
}
public List<String> getName() {
	return name;
}
public void setName(List<String> name) {
	this.name = name;
}


public Properties getEmail() {
	return email;
}
public void setEmail(Properties email) {
	this.email = email;
}
//public Map<Integer,Address> getAddress() {
//	return address;
//}
//public void setAddress(HashMap<Integer,Address> address) {
//	this.address = address;
//}
public Map<Long,String> getAdharno() {
	return adharno;
}
public void setAdharno(HashMap<Long,String> adharno) {
	this.adharno = adharno;
}
}
