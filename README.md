## reactnative-contacts-android
###### React-Native GetContacts module for Android

## Getting Started

### Installation
###### npm i @developers-arnest/reactnative-contacts-android

### Autolinking (>= 0.60)
###### react-native link @developers-arnest/reactnative-contacts-android


## Permissions
#### Android requires permission to read or write contacts.So add permissions in AndroidManifest.xml'
```
<uses-permission android:name="android.permission.READ_PROFILE" />
```

## API
```getContactsMatchingString (searchString, callback)```

## Example
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


