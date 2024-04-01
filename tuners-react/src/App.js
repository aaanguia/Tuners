import React from "react"
import "./App.css"
import { BrowserRouter as Router, Switch, Route } from "react-router-dom"
import NavBar from "./components/NavBar"
import Home from "./components/pages/Home"
import Catalog from "./components/pages/Catalog"
import SignUp from "./components/pages/SignUp"
import Orders from "./components/pages/Orders"
import MyProfile from "./components/pages/MyProfile"
import Footer from "./components/Footer"
import ProductPage from "./components/pages/ProductPage"

function App() {
  return (
    <>
      <Router>
        <NavBar />
        <Switch>
          <Route path="/" exact component={Home} />
          <Route path="/catalog" exact component={Catalog} />
          <Route path="/orders" exact component={Orders} />
          <Route path="/profile" exact component={MyProfile} />
          <Route path="/sign-up" exact component={SignUp} />
          <Route exact path="/inventory/:id" component={ProductPage} />
        </Switch>
        <Footer />
      </Router>
    </>
  )
}

export default App
