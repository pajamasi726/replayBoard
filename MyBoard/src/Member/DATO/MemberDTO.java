package Member.DATO;

/**
 * Member ���� Data transfer Object 
 * @author Administrator
 */
public class MemberDTO 
{
	private String 		id;			//���̵�
	private String 		pass;		//��й�ȣ
	private String 		name;		//�̸�
	private int			age;		//����
	private String		address;	//�ּ�
	private String		phone;	//����ȣ
	private String		hobby;	//���
	
	//������
	public MemberDTO (String id, String pass, String name, int age, String address, String phone, String hobby)
	{
		this.id		= id;
		this.pass		= pass;
		this.name	= name;
		this.age		= age;
		this.address	= address;
		this.phone	= phone;
		this.hobby	= hobby;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}