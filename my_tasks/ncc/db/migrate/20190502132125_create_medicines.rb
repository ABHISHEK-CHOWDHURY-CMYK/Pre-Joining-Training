class CreateMedicines < ActiveRecord::Migration[5.2]
  def change
    create_table :medicines do |t|
    	t.string :title
    	t.text :description
    	t.string :company  #changed
    	t.text :batch_number #changed
    	t.text :manufacturing_date #changed
    	t.text :expiry_date #changed
    end
  end
end
