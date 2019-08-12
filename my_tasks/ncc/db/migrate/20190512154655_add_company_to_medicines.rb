class AddCompanyToMedicines < ActiveRecord::Migration[5.2]
  def change
  	add_column :medicines, :company, :string
  end
end
