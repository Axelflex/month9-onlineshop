<#macro login path>
<form action="/{path}" method="post">
  <div><lable>User name : <input type="text" name="username"/> </lable></div>
  <div><lable>Password : <input type="password" name="password"/> </lable></div>
  <div><input type="submit" value="Sign in"/></div>
</form>
</#macro>