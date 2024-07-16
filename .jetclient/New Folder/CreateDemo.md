```toml
name = 'CreateDemo'
method = 'POST'
url = 'http://localhost:8080/api/v1/demodata'
sortWeight = 1000000
id = 'bc14c8e7-7486-4dc2-bd00-98eb5ea3b58d'

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
