## reactnative-contacts-android
###### React-Native GetContacts module for Android

## Getting Started

### Installation
###### npm i @developers-arnest/reactnative-contacts-android

### Autolinking (>= 0.60)
###### react-native link @developers-arnest/reactnative-contacts-android


## Permissions
#### Android requires permission to read or write contacts.So add permissions in AndroidManifest.xml
```
<uses-permission android:name="android.permission.READ_PROFILE" />
```

## API
```getContactsMatchingString (searchString, callback)```- returns contacts matching searchString name (first,last,family)

## Example
##### Needed to check whether do you have permission to access contacts before using the api. ```checkPermission``` or ```requestPermission``` method can be used to check.[https://facebook.github.io/react-native/docs/permissionsandroid.html]
```
Contacts.getContactsMatchingString(letter,(err, contacts) => {
  if (err) 
  {
    throw err;
  }
  // the returned contact list
  let myContacts  = contacts
 }
```     


