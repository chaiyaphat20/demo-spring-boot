```toml
name = 'GetDemoDataById'
method = 'GET'
url = 'http://localhost:8080/api/v1/demodata/1'
sortWeight = 750000
id = 'f9c94cea-4d65-4d12-a9f5-b9169ded48ff'

[[headers]]
key = 'Content-Type'
value = 'application/json'

[body]
type = 'JSON'
raw = '''
{
  "id":1,
  "name":"art",
  "email":"chairre@gmail.com",
  "phone":"09999999",
  "address":"123 test"
}'''
```
