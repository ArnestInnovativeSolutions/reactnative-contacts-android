## reactnative-contacts-android
###### React-Native GetContacts module for Android

## Getting Started

### Installation
###### npm i @developers-arnest/reactnative-contacts-android

### Autolinking (>= 0.60)
###### react-native link @developers-arnest/reactnative-contacts-android

## API
```getContactsMatchingString (searchString, callback)```

## Example
```
Contacts.getContactsMatchingString(letter,(err, contacts) => {
  if (err) 
  {
    throw err;
  }
  \\ the returned contact list
  let myContacts  = contacts
 }
```     


