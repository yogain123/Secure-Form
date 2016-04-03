angular
.module('app')
.controller('homeCtrl',function($scope,$state,$http,messages) {
  //$scope.list1={};
    $scope.countries = ["India", "Austrailia", "USA"];
    $scope.gender = ["Male","Female","Other"];
    $scope.states=["Uttar Pradesh","Karnataka","Jharkhand","Tamil Nadu","Victoria","Queensland","New South Wales","California","Texas","Vermont"];
    $scope.locations=["Kanpur","Bangalore","Jamshedpur","Chennai","Melbourne","Brisbane","Sydney","Los Angeles","Houston","Montpelier"];
    $scope.reset = function () {
      $scope.list={};
      $scope.MyForm.$setPristine();
      $scope.MyForm.$setValidity();
      $scope.MyForm.$setUntouched();
      $scope.submitted=false;
      $scope.list.email="";
};

$scope.submittedForm = function () {

        // Set the 'submitted' flag to true
        $scope.submitted = true;
        if ($scope.MyForm.$valid) {
          if($scope.list.mname)
          {
            messages.add("Name",$scope.list.fname+" "+$scope.list.mname+" "+$scope.list.lname);
          }
          else
          {
            messages.add("Name",$scope.list.fname+" "+$scope.list.lname);
          }
          messages.add("Date of Birth",$scope.list.date);
          if($scope.list.addressline2)
          {
            messages.add("Address",$scope.list.addressline1+" "+$scope.list.addressline2);
          }
          else
          {
            messages.add("Address",$scope.list.addressline1);
          }
          messages.add("City",$scope.list.city);
          messages.add("Country",$scope.list.selectedCountry);
          if($scope.list.phone)
          {
            messages.add("Phone Number",$scope.list.phone);
          }
          messages.add("AppointmentDate",$scope.list.appdate);
          messages.add("Gender",$scope.list.selectedGender);
          messages.add("Location",$scope.list.selectedLocation);
          messages.add("State",$scope.list.selectedState);
          if($scope.list.zipcode1 && $scope.list.zipcode2)
          {
            messages.add("ZipCode",$scope.list.zipcode1+"-"+$scope.list.zipcode2);
          }
          if($scope.list.email)
          {
            messages.add("Email",$scope.list.email)
          }
        	if(!$scope.list.phone)
        		{
        		$scope.list.phone="";
        		}
        	if(!$scope.list.mname)
        		{
        		$scope.list.mname="";
        		}
        	if(!$scope.list.addressline2)
    		{
    		$scope.list.addressline2="";
    		}
        	if(!$scope.list.zipcode1)
    		{
    		$scope.list.zipcode1="";
    		}
        	if(!$scope.list.zipcode2)
    		{
    		$scope.list.zipcode2="";
    		}
        	if(!$scope.list.email)
    		{
    		$scope.list.email="";
    		}
        	var FormData=$scope.list;
          var response=$http.post('PostFormData',JSON.stringify( FormData),{headers : {
				'Content-Type' : 'application/json'
			}});
			response.success(function(data, status, headers, config) {
				alert("OK");
			});
			response.error(function(data, status, headers, config) {
				alert( "Exception details: " + JSON.stringify({data: data}));
			});

          //alert(messages);
         $state.go('display');
        }
        else {
            alert("Please correct errors!");
        }
};
});