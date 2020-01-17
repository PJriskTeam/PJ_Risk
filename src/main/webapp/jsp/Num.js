
function up(form)
{
	form.action = "upload.do?method=post";
	form.submit();
}

function sht(form)
{
	form.action = "updates.do?method=post";
	form.submit();
}
