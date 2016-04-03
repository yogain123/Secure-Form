angular.module('app')
    	//Service
.factory('messages', function(){
  			var messages = {};
			messages.list = [];
			messages.add = function(str,message)
			{
    			messages.list.push({id: str, text: message});
  			};

 			 return messages;
		});