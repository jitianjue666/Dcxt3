// JavaScript Document
var jq = jQuery.noConflict();

jQuery(document).ready(function(){
	 jq("#qwert").load("allshop4");
	jq("#ertyu").load("getid");
	jq("#pou9").load("pou");
	jq("#pou10").load("pou2");
	jq(".nav").hover(function(){						   
		jq(this).find(".leftNav").show();
	},function(){
		jq(this).find(".leftNav").hide();
	});
});	

