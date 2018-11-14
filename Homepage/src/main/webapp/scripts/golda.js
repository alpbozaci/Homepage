
function getPlayerList()
{
	$.ajax(
	{
		url: 'goldaServlet',
		type:'POST',
		dataType: "json",
		success: function (data) {
			$.each(data, function(index, element) {
				console.log("firstname:" + element.firstname);
				console.log("lasttname:" + element.lastname);
				console.log("position:"  + element.number);
				console.log("position:"  + element.position);
				
				
				var tablerow = "<tr><td>" + element.firstname + "</td>" + "<td>" + element.lastname + "</td>" + "<td>" + element.number + "</td>" + "<td>" + element.position + "</td></tr>";
				console.log("tablerow:"  + tablerow);
				$('table tbody').append(tablerow);
			});
		},
		error:function(data,status,er) {
			alert("error: "+data+" status: "+status+" er:"+er);
		}
	});

}