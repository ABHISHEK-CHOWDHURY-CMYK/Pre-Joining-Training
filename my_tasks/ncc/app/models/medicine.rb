class Medicine < ApplicationRecord
	belongs_to :user
	validates :title, presence: true, length: {minimum: 3, maximum: 50}
	validates :description, presence: true, length: {minimum: 10, maximum: 300}
	validates :company, presence: true, length: {minimum: 3, maximum: 50}                #changed
 	validates :batch_number, presence: true, length: {minimum: 3, maximum: 50}           #changed
	validates :manufacturing_date, presence: true, length: {minimum: 3, maximum: 50}     #changed
	validates :expiry_date, presence: true, length: {minimum: 3, maximum: 50}            #changed
	validates :user_id, presence: true
end
