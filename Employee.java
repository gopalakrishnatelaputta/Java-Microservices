package collectionsandframework;

import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public boolean equals(Object o)
	{
		if (this==o) return true;
		
		if (o==null||getClass()!=o.getClass())
			{
			return false;
	        }
		Employee employee=(Employee)o;
		return id==employee.id;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(id);
		
	}
	@Override
	public int compareTo(Employee employee) {
		
		return this.getId()-employee.getId();
	}
	@Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
}
}
