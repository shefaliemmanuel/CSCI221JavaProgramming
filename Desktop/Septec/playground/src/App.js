import React from 'react';
import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={require('./logo512.png')} className="App-logo" alt="logo" />
        <h2>
          <button class="btn upload">Upload</button>
        </h2>
        <h2>
          <button class="btn run">Run Analysis</button>
        </h2>
        <h2>Prediction:</h2>
        <a href="https://www.thesitewizard.com/" target="_blank">Learn more about our Algorithm</a>
      </header>
    </div>
  );
}

export default App;
