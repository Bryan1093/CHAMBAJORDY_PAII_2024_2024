package default_package;

public class Subjects {
	int id;
	String name;
	String description;
	int level;
	
	public Subjects(int id, String name, String description, int level) {
		// TODO Auto-generated constructor stub
		this.level=level;
		this.id=id;
		this.description=description;
		this.name=name;
		
	}
	
	@Override
	public String toString() {
	    return "Subjects{" +
	            "ide=" + id +
	            ", name='" + name + '\'' +
	            ", description='" + description + '\'' +
	            ", level=" + level +
	            '}';
	}

	public int getIde() {
		return id;
	}

	public void setIde(int ide) {
		this.id = ide;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description ) {
		this.description = description;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}

