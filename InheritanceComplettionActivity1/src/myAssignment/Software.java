package myAssignment;

public final class Software extends Product {
	private String programmer;
	private String platform; // linux, mac, or pc
	private String os;

	public Software() {
		super();
		this.programmer = "";
		this.platform = "";
		this.os = "";
	}

	public String getProgrammer() {
		return programmer;
	}

	public void setProgrammer(String programmer) {
		this.programmer = programmer;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String whoAmI() {
		return "Software";
	}

	public boolean equals(Object o) {
		Software s = (Software) o;
		if (super.equals(o)
				&& s.getProgrammer().equalsIgnoreCase(this.programmer)
				&& s.getPlatform().equalsIgnoreCase(this.platform)
				&& s.getOs().equalsIgnoreCase(this.os))

			return true;
		else
			return false;
	}
}