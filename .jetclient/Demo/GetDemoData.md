```toml
name = 'GetDemoData'
method = 'GET'
url = 'http://localhost:8080/api/v1/demodata'
sortWeight = 500000
id = 'a0a3cd1b-0c4f-408d-aab0-8a38b87246ef'

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
