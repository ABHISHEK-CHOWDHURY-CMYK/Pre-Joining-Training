class AddBatchNumberToMedicines < ActiveRecord::Migration[5.2]
  def change
  	add_column :medicines, :batch_number, :text
  	add_column :medicines, :manufacturing_date, :text
  	add_column :medicines, :expiry_date, :text
  end
end
