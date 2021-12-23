var limitDateCheck = komsaUtil.calcDate(komsaUtil.replaceAll($(this,__activeTabObj).val(), "-", ""), "M", 60);

```
	if(limitDateCheck != undefined && limitDateCheck != null){
		var limitDate = shiUtil.limitDateCalc($(this,__activeTabObj).val(), 14);
		$("#shiSerOceanPollutnPrvnEqpMng06LimitDate",__activeTabObj).val(limitDate);

		var compareDate = $("#shiSerOceanPollutnPrvnEqpMng06RequestDate").val();

		var start_arr = compareDate.split("-");
		var end_arr = limitDate.split("-");

		var start_date = new Date(start_arr[0],start_arr[1],start_arr[2]);
		var end_date = new Date(end_arr[0],end_arr[1],end_arr[2]);

		console.log("start_date: "+start_date,+", end_date: "+end_date);

		var between_day = (end_date.getTime() - start_date.getTime())/(1000*60*60*24);
		console.log("be: "+between_day);
		$("#between_day").html(between_day);

```

var holidays = {
"0101":{type:0, title:"신정", year:""},
"0301":{type:0, title:"삼일절", year:""},
"0505":{type:0, title:"어린이날", year:""},
"0606":{type:0, title:"현충일", year:""},
"0815":{type:0, title:"광복절", year:""},
"1003":{type:0, title:"개천절", year:""},
"1009":{type:0, title:"한글날", year:""},
"1225":{type:0, title:"크리스마스", year:""},

"0209":{type:0, title:"설날", year:"2013"},
"0210":{type:0, title:"설날", year:"2013"},
"0211":{type:0, title:"설날", year:"2013"},
"0918":{type:0, title:"추석", year:"2013"},
"0919":{type:0, title:"추석", year:"2013"},
"0920":{type:0, title:"추석", year:"2013"},
"0517":{type:0, title:"석가탄신일", year:"2013"}
};

정리 필요