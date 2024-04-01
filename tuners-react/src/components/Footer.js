import React from "react"
import { Link } from "react-router-dom"
import { Button } from "./Button"
import "./Footer.css"

function Footer() {
  return (
    <div className="footer-container">
      <section className="footer-subscription">
        <p className="footer-subscription-heading">
          Become the Tuner you were always meant to be
        </p>
        <p className="footer-subscription-text">
          You can unsubscribe at any time.
        </p>
        <div className="input-areas">
          <form>
            <input
              className="footer-input"
              name="email"
              type="email"
              placeholder="Your Email"
            />
            <Button buttonStyle="btn--outline">Subscribe</Button>
          </form>
        </div>
      </section>
      <div class="footer-links">
        <div className="footer-link-wrapper">
          <div class="footer-link-items">
            <h2>About Us</h2>
            <Link to="/sign-up">How it works</Link>
            <Link to="/">Testimonials</Link>
            <Link to="/">Careers</Link>
            <Link to="/">Terms of Service</Link>
          </div>
          <div class="footer-link-items">
            <h2>Contact Us</h2>
            <Link to="/">Contact</Link>
            <Link to="/">Support</Link>
            <Link to="/">Sponsorships</Link>
          </div>
        </div>
        <div className="footer-link-wrapper">
          <div class="footer-link-items">
            <h2>Out Reach</h2>
            <Link to="/">Submit Media</Link>
            <Link to="/">Brand Ambassadors</Link>
            <Link to="/">Advertisements</Link>
            <Link to="/">Influencers</Link>
          </div>
        </div>
      </div>
      <section class="social-media">
        <div class="social-media-wrap">
          <div class="footer-logo">
            <Link to="/" className="social-logo">
              Tun3rs &nbsp; <i class="fas fa-rupee-sign" /> &nbsp; Us
            </Link>
          </div>
          <small class="website-rights">TUN3 © 2021</small>
          <div class="social-icons">
            <a
              class="social-icon-link facebook"
              href="https://www.facebook.com/benhartnettvisuals/"
              target="_blank"
              aria-label="Facebook"
              rel="noreferrer"
            >
              <i class="fab fa-facebook-f" />
            </a>
            <Link
              class="social-icon-link instagram"
              to="/"
              target="_blank"
              aria-label="Instagram"
            >
              <i class="fab fa-instagram" />
            </Link>
            <a
              class="social-icon-link youtube"
              href="https://www.youtube.com/Hartnett_Media%E2%80%8B"
              target="_blank"
              rel="noreferrer"
              aria-label="Youtube"
            >
              <i class="fab fa-youtube" />
            </a>
            <a
              class="social-icon-link twitter"
              href="https://www.youtube.com/Hartnett_Media%E2%80%8B"
              target="_blank"
              rel="noreferrer"
              aria-label="Twitter"
            >
              <i class="fab fa-twitter" />
            </a>
          </div>
        </div>
      </section>
    </div>
  )
}

export default Footer
