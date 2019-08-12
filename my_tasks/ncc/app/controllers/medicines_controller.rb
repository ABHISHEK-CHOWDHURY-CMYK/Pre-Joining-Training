class MedicinesController < ApplicationController
	
	def index
		@medicines = Medicine.all
	end

	def new
		@medicine = Medicine.new
	end
	
	def create
		@medicine = Medicine.new(medicine_params)
		@medicine.user = User.first
		if @medicine.save
			flash[:notice] = "Medicine was successfully added"
			redirect_to medicine_path(@medicine)
		else
			render 'new'
		end
	end

	def edit 
		@medicine = Medicine.find(params[:id])
	end

	def search  
	  if params[:search].blank?  
	    redirect_to(root_path, alert: "Empty field!") and return  
	  else  
	    @medicine = params[:search]
	    @results = Medicine.all.where("title LIKE :search", search: @medicine)  	  
	  end  
	end

	def update
		@medicine = Medicine.find(params[:id])
		if @medicine.update(medicine_params)
			flash[:notice] = "Medicine details were successfully updated"
			redirect_to medicine_path(@medicine)
		else
			render 'edit'
		end
	end

	def show
		@medicine = Medicine.find(params[:id])
	end

	def medicines
	end

	def destroy
		@medicine = Medicine.find(params[:id])
		@medicine.destroy
		flash[:notice] = "Medicine was successfully removed"
		redirect_to medicines_path
	end

	private
		def medicine_params
			params.require(:medicine).permit(:title, :description, :company, :batch_number, :manufacturing_date, :expiry_date)
		end
end
