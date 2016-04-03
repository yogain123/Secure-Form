angular.module('app').controller('displayCtrl', function (messages){
	  			var self = this;
				self.msg= messages.list;
		});