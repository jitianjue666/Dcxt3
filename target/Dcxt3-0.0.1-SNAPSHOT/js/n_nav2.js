// JavaScript Document
var jq = jQuery.noConflict();

jQuery(document).ready(function(){
	 jq("#qwert").load("allshop2");
	jq("#ertyu").load("getid");
	jq("#pou").load("pou");
	jq("#pou2").load("pou2");
	jq(".nav").hover(function(){						   
		jq(this).find(".leftNav").show();
	},function(){
		jq(this).find(".leftNav").hide();
	});
});	

