import React from 'react';
import { StoreProvider } from './Store';
import CardComponent from './components/cardComponent';

function App() {
  return <StoreProvider>
    <CardComponent />
  </StoreProvider>
}

export default App;
