define("page/mediationTank/mediatorTank",["require","exports","module","components/jquery/jquery","page/header/pages"],function(a,e,o){var i=a("components/jquery/jquery");a("page/header/pages");var t=function(){var a=this;a.init(),a.doPage()};t.prototype.init=function(){i.ajax({url:"/findGoodAt",type:"get"}).done(function(a){if(1==a.code){var e="";i.each(a.data,function(a,o){e+='<li class="clearfix"><span class="scope'+a+'"> '+o.name+":</span>";var t="";i.each(o.majorScopes,function(a,e){e.majorScopes?(t+='<li class="clearfix"><span> '+e.name+':</span><div class="checkinfo">',i.each(e.majorScopes,function(a,e){t+=e.id==i("#_scopeVal").val()?'<em><a class="on" href="javascript:void(0);" data-id="'+e.id+'">'+e.name+"</a></em>":'<em><a href="javascript:void(0);" data-id="'+e.id+'">'+e.name+"</a></em>"}),t+="</div></li>"):(t+='<div class="checkinfo">',t+=e.id==i("#_scopeVal").val()?'<em><a class="on" href="javascript:void(0);" data-id="'+e.id+'">'+e.name+"</a></em>":'<em><a href="javascript:void(0);" data-id="'+e.id+'">'+e.name+"</a></em>",t+="</div>")}),e+=t+"</li>"}),i("#_goodBox").append(e)}}),i.ajax({url:"/findCityByParent",type:"get"}).done(function(a){1==a.code&&i.each(a.data,function(a,e){i("#_city").append(e.areaCode==i("#_areaVal").val()?'<li><a class="on" href="javascript:void(0);" data-code="'+e.areaCode+'" title="'+e.areaName+'">'+e.areaName+"</a></li>":'<li><a href="javascript:void(0);" data-code="'+e.areaCode+'" title="'+e.areaName+'">'+e.areaName+"</a></li>")})})},t.prototype.doPage=function(){var a=i("#totalPage").val(),e=i("#pageNumber").val();i(".pages").pagination({pageCount:a,coping:!0,current:e,homePage:"首页",endPage:"末页",prevContent:"上页",nextContent:"下页",callback:function(a){n(a)}})};var n=function(a){var e=i("#_scopeVal").val(),o=i("#_keyword").val(),t=i("#_idVal").val(),n=i("#_areaVal").val();location.href="/mediator/list?identity="+t+"&scopeId="+e+"&keyword="+o+"&areaCode="+n+"&pageNumber="+a};i(document).on("click","#_chooseCity",function(){var a=i(this).data("flag");0==a?(i(this).siblings(".choose-city").show(),i(this).find(".arrow-down").addClass("rotate"),i(this).data("flag",1)):(i(this).siblings(".choose-city").hide(),i(this).find(".arrow-down").removeClass("rotate"),i(this).data("flag",0))}),i(document).on("click","#_chooseGoodAt",function(){var a=i(this).data("flag");0==a?(i(this).siblings(".good-at-type").show(),i(this).find(".arrow-down").addClass("rotate"),i(this).data("flag",1)):(i(this).siblings(".good-at-type").hide(),i(this).find(".arrow-down").removeClass("rotate"),i(this).data("flag",0))}),i(document).on("click","#_search",function(){n(1)}),i(document).on("click","#_identify a",function(){i("#_idVal").val(i(this).data("code")),n(1)}),i(document).on("click","#_city li a",function(){i("#_areaVal").val(i(this).data("code")),n(1)}),i(document).on("click","#_goodBox .checkinfo a",function(){i("#_scopeVal").val(i(this).data("id")),n(1)}),i(document).on("click",".allScope",function(){i("#_scopeVal").val(""),n(1)}),o.exports=t});