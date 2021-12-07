# Demo spring boot kotlin hot sauces API based on https://auth0.com/blog/build-and-secure-an-api-with-spring-boot

### Steps to run locally:

```
    ./gradlew bootRun
```

### Example HTTP calls

### API CURL commands

```
   curl "http://localhost:8080/actuator/health"
   curl "http://localhost:8080/api/hotsauces/count"
   
   https://manage.auth0.com/dashboard/us/dev-cchglq9j/applications/2WwuRhVjZUtRi419BR1K8jeDIaqAjk1O/settings
   curl --request POST \
    --url https://dev-cchglq9j.us.auth0.com/oauth/token \
    --header 'content-type: application/json' \
    --data '{
        "client_id": "2WwuRhVjZUtRi419BR1K8jeDIaqAjk1O",
        "client_secret": "",
        "audience": "hotsauces.demo",
        "grant_type": "client_credentials"
    }'
   curl "http://localhost:8080/api/hotsauces"
   
   curl -i --request GET \
     --url http://localhost:8080/api/hotsauces/ \
     -H "Content-Type: application/json" \
     -H "authorization: Bearer ..."
     
   curl "http://localhost:8080/api/hotsauces?maxheat=10000"
   curl --request POST \
    --url http://localhost:8080/api/hotsauces/ \
    -H "Content-Type: application/json" \
    --data '{"brandName": "Dave’s Gourmet", "sauceName": "Temporary Insanity", "url": "https://store.davesgourmet.com/ProductDetails.asp?ProductCode=DATE", "description": "This sauce has all the flavor of Dave’s Original Insanity with less heat. Finally, there’s sauce for when you only want to get a little crazy in the kitchen. Add to stews, burgers, burritos, and pizza, or any food that needs an insane boost. As with all super hot sauces, this sauce is best enjoyed one drop at a time!", "heat": 57000}' \
         -H "authorization: Bearer "

    curl --request PUT \
    --url http://localhost:8080/api/hotsauces/10 \
    -H "Content-Type: application/json" \
    --data '{"brandName": "NewCo", "sauceName": "Generic Hot Sauce", "description": "It’s hot. It’s sauce. That’s it.", "heat": 1000}' \
         -H "authorization: Bearer "
```
