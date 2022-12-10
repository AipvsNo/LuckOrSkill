package CompanyList;

public class Company {
		private String name;
		private String description;

		public Company(String name,String description) {
			setName(name);
			setDescription(description);
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}

		public void setDescription(String description) {
			this.description = description;
		}
		
		public String getDescription() {
			return this.description;
		}

}
