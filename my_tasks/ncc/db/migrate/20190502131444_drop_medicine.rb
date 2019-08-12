class DropMedicine < ActiveRecord::Migration[5.2]
  def change
  	drop_table :medicines
  end
end
