define("page/mediationTank/mediatorDetail",["require","exports","module","components/jquery/jquery","static/libs/jquery-raty/jquery.raty"],function(t,r,e){var a=t("components/jquery/jquery");t("static/libs/jquery-raty/jquery.raty");var i=function(){var t=this;t.init()};i.prototype.init=function(){a(".score-num span").each(function(){var t=a(this);t.raty({readOnly:!0,score:function(){return t.data("score")},half:!0,path:"/static/libs/jquery-raty/images"})})},e.exports=i});