class NamedCow extends Cow
{
private String myName;
private String myType;
private String mySound;

public NamedCow(String type,String name, String sound)
{
	myName = name;
	myType = type;
	mySound = sound;
}
public NamedCow()
{
	myName = "Elsie";
	myType = "unknown";
	mySound = "unknown";
}
public String getName(){return myName;}
public String getSound(){return mySound;}
public String getType(){return myType;}
}