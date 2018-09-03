package entity;

public class App_category {
		private int id;
		private String categoryCode;		
		private String categoryName;
		private int parentId;
		private String createdBy;		
		private int creationTime;
		private String modifyBy;
		private int modifyDate;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCategoryCode() {
			return categoryCode;
		}
		public void setCategoryCode(String categoryCode) {
			this.categoryCode = categoryCode;
		}
		public String getCategoryName() {
			return categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		public int getParentId() {
			return parentId;
		}
		public void setParentId(int parentId) {
			this.parentId = parentId;
		}
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
		public int getCreationTime() {
			return creationTime;
		}
		public void setCreationTime(int creationTime) {
			this.creationTime = creationTime;
		}
		public String getModifyBy() {
			return modifyBy;
		}
		public void setModifyBy(String modifyBy) {
			this.modifyBy = modifyBy;
		}
		public int getModifyDate() {
			return modifyDate;
		}
		public void setModifyDate(int modifyDate) {
			this.modifyDate = modifyDate;
		}
		
		
}
