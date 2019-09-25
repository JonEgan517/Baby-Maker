public class Baby 
{
	private String gender;
	private double weight;
	private String name;
	private String school;
	private String sport;
	private String animals;
	private int number;
	private String classmate;
	private String music;
	private String food;
	
	
	public Baby(String g, double w, String n, String s, String sp, String a, int num, String c, String m, String f)
	{
		setGender(g);
		setWeight(w);
		setName(n);
		setSchool(s);
		setSport(sp);
		setAnimals(a);
		setNumber(num);
		setClassmate(c);
		setMusic(m);
		setFood(f);
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getAnimals() {
		return animals;
	}

	public void setAnimals(String animals) {
		this.animals = animals;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getClassmate() {
		return classmate;
	}

	public void setClassmate(String classmate) {
		this.classmate = classmate;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}	
}
