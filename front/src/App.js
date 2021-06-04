import React, { createContext } from 'react';
import Form from './components/form/Form';
import List from './components/list/List';
import StoreProvider from './components/storeProvider/StoreProvider';

const HOST_API = "http://localhost:8080/api";
const initialState = {
  todo: { list: [],
   item: {} 
  }
};

const Store = createContext(initialState)

function App() {
  return <StoreProvider>
    <h3>To-Do List</h3>
    <Form />
    <List />
  </StoreProvider>
}

export default App;
