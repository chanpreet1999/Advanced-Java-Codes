import pandas as pd # pandas is a library which provides me a way to easily store and access data
 # WRITES JSON
import csv
import json

import os
def main():		
# INPUT PHASE STARTS

	newfile = open('result.json', 'w')
	rake_data = pd.read_csv('rake.tsv', sep = '\t') # rake_data is a pandas "data frame" which stores the data contained in rake.tsv

	
	
	demand_data = pd.read_csv('demand.tsv', sep = '\t') 


# INPUT PHASE ENDS


	empty_rake = (rake_data[rake_data.FILLED == 0]).copy() # forms a new dataframe having all those rows which correspond to empty rakes


	rake_id = 0
	demand_id = 0

	empty_rake.sort_values(by = ['CPCTY'], inplace = True )  # sorting rakes in ascending order of capacity so that my tighest fit approach can work, if I don't sort, it can be really inefficient
	

	while empty_rake.empty == False: # till the time there are empty rakes queued to be allotted demands


		rake_id = empty_rake.iloc[0,0]
		demand_data.iloc[:,6] = (demand_data.iloc[:,5])*(demand_data.iloc[:,5])*30 + demand_data.iloc[:,2] # we assign a score = AGE^2 * 30 + LOAD

	
		valid_demand = (demand_data[demand_data.DIST + demand_data.LPOINT < empty_rake.iloc[0,4] ]).copy() # for the given rake we are only considering demands after keeping health of the rake in mind


		if empty_rake.iloc[0,1] == 'OPEN':
			valid_demand = valid_demand[valid_demand.TYPE != 'FOOD']  # added restriction that food cannot be transported in open top wagons
	
	
		valid_demand = valid_demand[valid_demand.LOAD <= empty_rake.iloc[0,2]] # only those demand whose load <= capacity of rake
	
	

		if valid_demand.empty == False:   
			valid_demand.sort_values(by = ['SCORE'], inplace = True, ascending = False)
			
			demand_id = valid_demand.iloc[0,0] 
			
			demand_data = demand_data[demand_data.ID != demand_id] # allotted demand removed

		# have to give rake_id and demand_id to the other part of the system which will update the database
			
			send = {	
				'rake_id': str(rake_id),
				'demand_id': str(demand_id)
			}
			
			with open('result.json', 'a') as f:  # writing JSON object
				json.dump(send, f)

	
		empty_rake = empty_rake.drop(empty_rake.index[0]) #the first queued rake is removed from the pending list after being allotted a demand, removed even if no demand could be allotted
	
		demand_data.iloc[:,5] = demand_data.iloc[:,5] + 1 # incrementing age of all the pending demands by 1
	


	

main()


